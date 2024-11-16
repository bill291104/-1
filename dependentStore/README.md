# 초심자가 작성한 DependentPizzaStore

## 요구사항 변경
* ### 서울에도 지점을 열었다.
* ### 메뉴에 김치 피자를 추가하고 페페로니 피자를 삭제한다.
    * #### 김치파자는 `Dough`가 쌀로 만들어지고 김치가 토핑으로 올라가는 것이다.

1. ### `DependentPizzaStore`에 Seoul style pizza를 추가한다.
2. ### `Pizza`추상 클래스의 상속을 받아 `SeoulStyleCheesePizza`, `SeoulStyleVeggiePizza`, `SeoulStyleClamPizza`, `SeoulStyleKimchiPizza`를 구현한다.
3. ### 새로만들어진 피자들을 주문해보고 결과를 확인한다.

> /...중략.../   
> Preparing Seoul Style Cheese Pizza   
> Tossing dough...   
> Adding sauce...   
> Adding toppings:   
> Shredded Cheddar cheese   
> Bake for 25 minutes at 350   
> Cutting the pizza into diagonal slices   
> Place pizza in official PizzaStore box   
> Gang-Hyun ordered a Seoul Style Cheese Pizza   
>    
> Preparing Seoul Style Veggie Pizza   
> Tossing dough...   
> Adding sauce...   
> Adding toppings:   
> Shredded Cheddar cheese   
> PyengChang fried potato   
> Bake for 25 minutes at 350   
> Cutting the pizza into diagonal slices   
> Place pizza in official PizzaStore box   
> Gang-Hyun ordered a Seoul Style Veggie Pizza   
>    
> Preparing Seoul Style Clam Pizza   
> Tossing dough...   
> Adding sauce...   
> Adding toppings:   
> Shredded Cheddar cheese   
> Boryung pen shell   
> Bake for 25 minutes at 350   
> Cutting the pizza into diagonal slices   
> Place pizza in official PizzaStore box   
> Gang-Hyun ordered a Seoul Style Clam Pizza   
>    
> Preparing Seoul Style Kimchi Pizza   
> Tossing dough...   
> Adding sauce...   
> Adding toppings:   
> Shredded Cheddar cheese   
> Kimchi   
> Bake for 25 minutes at 350   
> Cutting the pizza into diagonal slices   
> Place pizza in official PizzaStore box   
> Gang-Hyun ordered a Seoul Style Kimchi Pizza   

## 결론
* ### 새로운 서울 지점이 생김에 따라 `DependentPizzaStore`코드를 수정해야 했다.
  * #### `style`이 `seoul`인지 확인하는 else-if 블럭이 추가됨.
  * #### 그 블럭 안에는 다른 else-if 블럭과 코드 중복이 생겼다.
* ### 서울 스타일의 피자를 모두 구현해야했다.
  * #### 재료에는 차이가 있었지만 대부분의 `Pizza`를 구현하는 코드가 중복되었다.