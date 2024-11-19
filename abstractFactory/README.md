# Abstract Factory가 적용된 버전

## 요구사항 변경
* ### 서울에도 지점을 열었다.
* ### 메뉴에 김치 피자를 추가하고 페페로니 피자를 삭제한다.
    * #### 김치파자는 `Dough`가 쌀로 만들어지고 김치가 토핑으로 올라가는 것이다.

1. ### `PizzaStore`추상 클래스의 상속을 받아 `SeoulPizzaStore`를 구현한다.
2. ### `PizzaIngredientFactory`인터페이스를 구현하는 `SeoulPizzaIngredientFactory`를 만든다.
3. ### `Seoul Style`에 맞는 재료들을 생산한다.
4. ### `Pizza`추상 클래스의 상속을 받아 `KimchiPizza`를 구현한다.
5. ### 새로만들어진 피자들을 주문해보고 결과를 확인한다.

> /...중략.../   
> --- Making a Seoul Style Cheese Pizza ---   
> Preparing Seoul Style Cheese Pizza   
> Bake for 25 minutes at 350   
> Cutting the pizza into diagonal slices   
> Place pizza in official PizzaStore box   
> GangHyun ordered a ---- Seoul Style Cheese Pizza ----   
> Rice Dough   
> Tomato sauce with plum tomatoes   
> Shredded Cheddar Cheese   
>    
>    
> --- Making a Seoul Style Veggie Pizza ---   
> Preparing Seoul Style Veggie Pizza   
> Bake for 25 minutes at 350   
> Cutting the pizza into diagonal slices   
> Place pizza in official PizzaStore box   
> GangHyun ordered a ---- Seoul Style Veggie Pizza ----   
> Rice Dough   
> Tomato sauce with plum tomatoes   
> Shredded Cheddar Cheese   
> Garlic, Onion, Mushrooms, Red Pepper, Black Olives, Spinach, Eggplant   
>    
>    
> --- Making a Seoul Style Clam Pizza ---   
> Preparing Seoul Style Clam Pizza   
> Bake for 25 minutes at 350   
> Cutting the pizza into diagonal slices   
> Place pizza in official PizzaStore box   
> GangHyun ordered a ---- Seoul Style Clam Pizza ----   
> Rice Dough   
> Tomato sauce with plum tomatoes   
> Shredded Cheddar Cheese   
> PenShell from Boryung   
>    
>    
> --- Making a Seoul Style Kimchi Pizza ---   
> Preparing Seoul Style Kimchi Pizza   
> Bake for 25 minutes at 350   
> Cutting the pizza into diagonal slices   
> Place pizza in official PizzaStore box   
> GangHyun ordered a ---- Seoul Style Kimchi Pizza ----   
> Rice Dough   
> Tomato sauce with plum tomatoes   
> Shredded Cheddar Cheese   
> Kimchi   

## 결론
* ### 새로운 서울 지점이 생겼지만 `PizzaStore`를 추상화 했기 때문에 피자 스타일을 확인한는 부분은 사라졌다.
    * #### 여전히 피자의 종류를 확인하고 대응하는 피자를 만드는 과정은 필요하지만, `createPizza`는 추상화 되어있기에 스타일에 대한 다형성 활용이 가능해졌다.
    * #### 결론적으로 수정해야할 부분이 줄어들었다.
* ### `PizzaIngredientFactory`를 추상화 했기 때문에 같은 종류의 피자라도 지점마다 스타일에 맞는 재료를 사용할 수 있다.
* ### 새로운 종류의 토핑(ex. kimchi)이 추가될 때마다 `PizzaIngredientFactory`, `Pizza`를 수정해야 한다.
    * #### `SeoulPizzaStore`에서만 판매하는 `KimchiPizza`를 구현하기 위해 `Pizza`에 필드변수를 추가하고 `toString`를 수정함
    * #### `PizzaIngredientFactory`에 `createKimchi`를 추가하고 이를 구현하는 다른 factory에서는 `null`을 반환함
    * #### 이러한 형태의 요구사항 변화에는 `Abstract Factory`가 적절하지 않은 것 같다.