# Factory Method가 적용된 버전

## 요구사항 변경
* ### 서울에도 지점을 열었다.
* ### 메뉴에 김치 피자를 추가하고 페페로니 피자를 삭제한다.
    * #### 김치파자는 `Dough`가 쌀로 만들어지고 김치가 토핑으로 올라가는 것이다.

1. ### `PizzaStore`추상 클래스의 상속을 받아 `SeoulPizzaStore`를 구현한다.
2. ### `Pizza`추상 클래스의 상속을 받아 `SeoulStyleCheesePizza`, `SeoulStyleVeggiePizza`, `SeoulStyleClamPizza`, `SeoulStyleKimchiPizza`를 구현한다.
3. ### 새로만들어진 피자들을 주문해보고 결과를 확인한다.

> --- Making a Seoul Style Cheese Pizza ---   
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
> --- Making a Seoul Style Veggie Pizza ---   
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
> --- Making a Seoul Style Cheese Pizza ---   
> Preparing Seoul Style Cheese Pizza   
> Tossing dough...   
> Adding sauce...   
> Adding toppings:   
> Shredded Cheddar cheese   
> Boryung pen shell   
> Bake for 25 minutes at 350   
> Cutting the pizza into diagonal slices   
> Place pizza in official PizzaStore box   
> Gang-Hyun ordered a Seoul Style Cheese Pizza   
>    
> --- Making a Seoul Style Kimchi Pizza ---   
> Preparing Seoul Style Kimchi Pizza   
> Tossing dough...   
> Adding sauce...   
> Adding toppings:   
> Shredded Cheddar cheese   
> kimchi   
> Bake for 25 minutes at 350   
> Cutting the pizza into diagonal slices   
> Place pizza in official PizzaStore box   
> Gang-Hyun ordered a Seoul Style Kimchi Pizza

## 결론
* ### 새로운 서울 지점이 생겼지만 `PizzaStore`를 추상화 했기 때문에 피자 스타일을 확인한는 부분은 사라졌다.
  * #### 여전히 피자의 종류를 확인하고 대응하는 피자를 만드는 과정은 필요하지만, `createPizza`는 추상화 되어있기에 스타일에 대한 다형성 활용이 가능해졌다.
  * #### 결론적으로 수정해야할 부분이 줄어들었다.
* ### 서울 스타일의 피자를 모두 구현해야했다.
  * #### 재료에는 차이가 있었지만 대부분의 `Pizza`를 구현하는 코드가 중복되었다.