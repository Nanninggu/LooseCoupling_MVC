1. **`UserService` 인터페이스**:
   - `UserService` 인터페이스는 사용자 서비스의 계약을 정의한다.
   - `UserServiceImpl` 클래스가 이를 구현한다.

2. **`UserServiceImpl` 클래스**:
   - `UserService` 인터페이스를 구현한다.
   - `UserMapper` 인터페이스에 의존한다.

3. **`UserMapper` 인터페이스**:
   - 데이터베이스와 상호작용하는 메서드를 정의한다.
   - MyBatis를 사용하여 매퍼로 등록한다.

4. **의존성 주입**:
   - `UserServiceImpl` 클래스는 `UserMapper`를 생성자 주입을 통해 주입받는다.

다이어그램을 그리는 방법:

1. **인터페이스와 클래스**:
   - `UserService` 인터페이스를 상단에 배치한다.
   - `UserServiceImpl` 클래스를 `UserService` 인터페이스 아래에 배치하고, 구현 관계를 화살표로 연결한다.

2. **의존성 주입**:
   - `UserServiceImpl` 클래스에서 `UserMapper` 인터페이스로 화살표를 그려 의존성을 나타낸다.

3. **MyBatis 매퍼**:
   - `UserMapper` 인터페이스를 별도로 배치하고, MyBatis와의 관계를 나타낸다.

다음은 텍스트로 표현한 다이어그램이다:

```
+-------------------+        +-------------------+
|   UserService     |        |   UserMapper      |
|-------------------|        |-------------------|
| + getAllUsers()   |        | + findAll()       |
+-------------------+        +-------------------+
          ^                           ^
          |                           |
          |                           |
+-------------------+        +-------------------+
| UserServiceImpl   |        | MyBatis           |
|-------------------|        |-------------------|
| - userMapper      |        |                   |
| + getAllUsers()   |        |                   |
+-------------------+        +-------------------+
```

이 다이어그램은 `UserService` 인터페이스와 이를 구현하는 `UserServiceImpl` 클래스, 
그리고 `UserServiceImpl` 클래스가 의존하는 `UserMapper` 인터페이스 간의 관계를 나타낸다. 
`UserMapper`는 MyBatis를 통해 데이터베이스와 상호작용한다.

동작 순서는 아래와 같다. `UserMapper`, `UserServiceImpl`, `UserService`는 다음과 같은 순서로 동작한다:

1. **MyBatis**: 데이터베이스와 상호작용하는 매퍼를 제공한다.
2. **`UserMapper`**: MyBatis 매퍼 인터페이스로, 데이터베이스에서 사용자 정보를 조회하는 메서드를 정의한다.
3. **`UserServiceImpl`**: `UserService` 인터페이스를 구현하는 클래스이다. `UserMapper`를 주입받아 사용자 정보를 조회하는 메서드를 구현한다.
4. **`UserService`**: 사용자 서비스의 계약을 정의하는 인터페이스이다. `UserServiceImpl` 클래스가 이를 구현한다.

이 순서로 동작하여 데이터베이스에서 사용자 정보를 조회하고, 이를 서비스 계층에서 사용할 수 있게 된다.