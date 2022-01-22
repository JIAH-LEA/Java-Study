### 1. 배열이란?

: **같은 타입**의 여러 변수를 하나의 묶음으로 다루는 것 

```java
int[] score = new int[5]; 
```

→ 이때 변수 score는 배열을 다루는데 필요한 참조변수, 저장 공간이 아님  
</br>

### 2. 배열의 선언과 생성 


🟦 **배열의 선언**

```java
// 1. 타입[] 변수이름;
int[] age;
String[] name;

// 2. 타입 변수이름[];
int age[];
String name[]; 
```

→ 배열을 선언하는 것은 단지 생성된 배열을 다루기 위한 참조변수(score, name)를 위한 공간을 만든 것 뿐, 배열 생성(값을 저장할 수 있는 공간)은 아직 안된 상태



**🟦 배열의 생성** 

```java
int[] age; //int형 배열을 다룰 참조변수 score 선언 (배열 선언) 
age= new int[5]; // 값을 저장하기 위한 공간 생성 (배열 생성) 

int[] age= new int[5]; 
```

- **생성의 순서**
    1. 연산자 new에 의해 메모리의 빈 공간에 5개의 int형 데이터를 저장할 수 있는 공간이 마련됨
    2. 각 공간(element)은 자동적으로 `int의 default값인 0`으로 초기화 됨 
    3. `= 연산자`에 의해 참조변수에 배열의 주소가 저장됨
    
</br>

### 3. 배열의 길이와 인덱스

**🟦 배열의 요소 & Index**

- **배열의 요소** : 각 저장 공간 ↔ **인덱스**: 각 요소마다 붙여진 번호
    
    ex) 배열 age의 첫번째 요소 = age[0]  `index는 element-1`
    
- I**ndex로 상수, 변수, 수식 모두 사용 가능함**
    
    ex) for문 생각해보기 
    

<span style="color:red"> ❓ **유효 범위 값 밖의 Index** </span>

- 변수 값은 실행 시 대입 되니까 컴파일러가 이 값의 범위를 확인 할 수 없음(컴파일에러X)
- 실행 시 java.lang.ArrayIndexOutOfBoundsException  에러 발생

Q) 컴파일러란, 컴파일에러?



**🟦 배열의 길이** 

: 배열의 길이는 int범위의 양의 정수(0도 가능) 

- `arr.length`
    - 자바 JVM이 모든 배열의 길이를 별도로 관리함 ex) age.length
    - 배열 한 번 생성 시 길이 변경 불가 (읽기만 가능) ex) age.length = 100; (에러남)
- 배열 길이 바꾸고 싶으면?
    - 더 큰 배열 새로 생성
    - 기존 배열 내용을 새 배열에 복사
    
</br>

### 4. 배열의 초기화

: 배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화된다 (따로 초기화 필요 없음, 하고 싶으면 직접 지정) 

```java
// 배열의 초기화 방법 1
int[] pinMoney = new int[]{ 50, 60, 70, 80, 90 };
int[] pinMoney = { 50, 60, 70, 80, 90 }; // new int[] 생략 가능

// 배열의 초기화 방법 2
int pinMoney[];
pinMoney = { 50, 60, 70, 80, 90 }; // error
pinMoney = new int[]{ 50, 60, 70, 80, 90 }; // 생성, 선언 따로하면 'new 타입[]' 생략 불가 
```

*매개변수로 배열을 받는 method를 호출하는 경우에도 `new 타입[]` 생략 불가 

- 참조변수의  기본값은 null, 배열을 가리키는 참조변수는 null 대신 길이가 0인 배열로 초기화하기도 함
    
    ```java
    int[] arr1 = new int[0];
    int[] arr1 = new int[]{};
    int[] arr1 = { };
    ```
    

**🟦 배열의 출력** 

- for문 사용하기

```java
int[] arr1 = { 10, 20, 30, 40, 50 };

for(int i=0; i < arr1.length; i++){
	System.out.println(arr1[i]);
} 
```

- Arrays.toString(배열이름)

```java
import java.util.*;

int[] arr1 = { 10, 20, 30, 40, 50 };

System.out.println(Arrays.toString(arr1)); // [10, 20, 30, 40, 50] 
System.out.println(arr1); // [I@142345ab : 1차원 int배열@내부 주소 

//char배열 예외
char[] charArr = { 'a', 'b', 'c', 'd' };
System.out.println(charArr); // 주소출력(x) abcd(o) : println때문
```
</br>

### 5. 배열의 복사

- for문 사용하기 : 비용 多

```java
int[] arr = new int[5];

int[] temp = new int[arr.length*2];

for(i=0; i< temp.length; i++)
	temp[i] = arr[i];

arr = temp; // 참조변수 arr이 새로운 배열을 가리키게 함 

```

***배열은 참조변수를 통해서만 접근 가능함. 자신을 가르키는 참조변수가 없는 배열은 사용 할 수 없디 → `JVM 가비지 컬렉터`에 의해 자동적으로 메모리에서 제거됨** 

**🟦 System.arraycopy()를 이용한 배열의 복사**  

: for문 보다 간단하고 효율성 있음→ 요소 하나하나 접근X, 범위 통째로 복사 

```java
// 어느 배열의 몇번째 요소에서 어느 배열의 몇번째 요소로 몇개를 복사할 지
System.arraycopy(num, 0, newNum, 0, num.length); // num[0] -> newNum[0]으로 num배열 길이 수 만큼 
```

*이때 복사 배열 위치 적절하지 않거나 여유 공간 없으면 **ArrayIndexOutOfBoundsException** 발생
