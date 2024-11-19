# [Design Pattern - 프로그램 숙제 1](https://github.com/bill291104/DesignPattern-ProgramHomework1)
## Factory Pattern
## 요구사항 변경
* ### 서울에도 지점을 열었다.
* ### 메뉴에 김치 피자를 추가하고 페페로니 피자를 삭제한다.
    * #### 김치파자는 `Dough`가 쌀로 만들어지고 김치가 토핑으로 올라가는 것이다.

## 과제 진행
#### 진행과정은 아래의 소스코드와 커밋을 확인해주세요.
* [초심자가 작성한 source code](https://github.com/bill291104/DesignPattern-ProgramHomework1/tree/master/dependentStore)
* [Factory Method가 적용된 버전](https://github.com/bill291104/DesignPattern-ProgramHomework1/tree/master/factoryMethod)
* [Abstract Factory가 적용된 버전](https://github.com/bill291104/DesignPattern-ProgramHomework1/tree/master/abstractFactory)

## 결론
* ### `Factory Pattern`을 활용하면 객체의 인스턴스를 생성하는 책임을 분리할 수 있다.
* ### `Factory Method`와 `Abstract Factory`는 각자 어울리는 상황이 있다.
    * ### 지점이 계속 늘어나는 상황에서는 `Factory Method`가 유용했다.
    * ### 새로운 재료를 추가할 때 는 `Abstract Factroy`가 유용했다. 
        * #### 기존에 가지고 있는 종류(cheese, dough)에 추가하는 것은 쉬었으나, 새로운 종류(kimchi)를 추가하는 것은 어려웠다.
* ### `Factory Pattern`을 잘 활용하면 `DIP`, `OCP`등이 지켜지고 `다형성`을 잘 활용할 수 있게 된다.