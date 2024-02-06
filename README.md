## 행동 패턴(Behavioral Pattern)

### Iterator
![Iterator.png](images%2FIterator.png)
컬렉션의 내부 표현 방식과는 독립적으로, 컬렉션 내의 각 요소에 순차적으로 접근할 수 있는 방법을 제공한다.

### Strategy
![Strategy.png](images%2FStrategy.png)
알고리즘을 객체로 캡슐화하여, 알고리즘을 사용하는 클라이언트와 독립적으로 알고리즘을 변경할 수 있게 한다.Strategy 패턴은 동일한 문제를 해결할 수 있는 여러 알고리즘(전략)을 정의하고, 이를 캡슐화하여 상호 교체 가능하도록 만든다. 이 패턴을 사용하면 클라이언트는 알고리즘의 세부 구현 내용을 알 필요 없이, 필요에 따라 다른 알고리즘(전략)을 쉽게 선택하여 사용할 수 있다.
두 클래스 FixDiscountStrategy와 RateDiscountStrategy는 DiscountStrategy 인터페이스를 구현하고 있으며, getDiscountPrice 메서드를 오버라이드하여 각기 다른 방식으로 할인 가격을 계산한다.

전략 패턴에서는 알고리즘(본 예에서는 할인 계산 방식)을 정의하고, 이를 캡슐화하여 실행 시점에 클라이언트가 사용할 전략을 선택할 수 있게 한다. 클라이언트 코드는 전략 인터페이스(DiscountStrategy)에 의존하며, 구체적인 전략(FixDiscountStrategy 또는 RateDiscountStrategy)은 실행 시점에 결정될 수 있다.

FixDiscountStrategy 클래스는 구매 가격에 따라 고정된 할인 금액을 반환하는 반면, RateDiscountStrategy 클래스는 구매 가격에 따라 비율로 할인 금액을 계산하여 반환한다. 이 두 전략은 서로 교환 가능하며, 상황에 따라 클라이언트는 두 전략 중 하나를 선택하여 사용할 수 있다.

### Template
![Template.png](images%2FTemplate.png)
알고리즘의 구조를 정의하고, 일부 단계를 서브클래스에서 구현할 수 있게 함으로써, 알고리즘의 일부 변경을 용이하게 한다.

## 구조 패턴(Structural Pattern)

### Adapter
![Adapter.png](images%2FAdapter.png)
Adapter 패턴은 인터페이스의 호환성 문제 때문에 함께 사용할 수 없는 클래스들이 함께 작동할 수 있도록 해준다. 이 패턴은 기존의 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환하는 역할을 한다.

### Bridge
![Bridge.png](images%2FBridge.png)
추상화와 구현을 분리하여 서로 독립적으로 변형할 수 있게 해준다. 이 패턴은 구현부에서 추상화된 부분을 분리하여, 각각 독립적으로 개발할 수 있게 해준다.이 패턴의 주 목적은 구현이 여러 차원으로 확장될 수 있는 큰 규모의 시스템에서, 추상화를 구현으로부터 분리하여 각각 독립적으로 발전시킬 수 있게 하는 것이다.

Bridge 패턴의 핵심 아이디어는 추상화(abstraction)와 구현(implementation)을 분리하는 것이다. 이렇게 함으로써, 두 계층을 독립적으로 확장하고 수정할 수 있게 된다.

다이어그램에서 Draft와 Publication 클래스는 추상화를 나타내며, Display 인터페이스와 그것을 구현하는 SimpleDisplay와 CaptionDisplay 클래스는 구현을 나타낸다.

**추상화 계층 (Abstraction Layer)**
- Draft: 원고를 나타내는 클래스로, 기본적인 속성인 제목(title), 저자(author), 내용(contents)을 가지고 있다.
- Publication: Draft 클래스를 확장하여 출판물을 나타내고, 추가적으로 출판사(publisher)와 가격(price) 정보를 포함한다.
추상화 계층에서 display(Display display) 메서드를 통해 다양한 디스플레이 방식을 사용할 수 있는 기능을 제공한다.


**구현 계층 (Implementation Layer)**
- Display: 출력 형식을 정의하는 인터페이스로, title, author, contents 메서드를 통해 원고의 다양한 부분을 어떻게 표시할지 정의한다.
- SimpleDisplay와 CaptionDisplay: Display 인터페이스의 구현체로, 원고를 실제로 어떻게 표시할지 구체적인 로직을 포함한다.
이 구조에서 Draft나 Publication 클래스는 Display 인터페이스의 어떤 구현체를 사용할지 직접 알지 못한다. 대신, 이들은 display(Display display) 메서드를 통해 Display 인터페이스에 정의된 방식으로 자신을 표시하도록 요청한다. 이로써, 추상화 계층은 구현 계층의 변화에 영향을 받지 않고, 구현 계층 또한 추상화 계층의 변화에 영향을 받지 않는다.

Bridge 패턴의 장점은 추상화와 구현의 분리로 인해, 새로운 Display 구현체를 추가하거나 기존 구현체를 변경해도 Draft 또는 Publication 클래스를 수정할 필요가 없다는 것이다. 마찬가지로, 원고나 출판물 클래스에 변경이 있어도, 이는 Display 인터페이스나 그 구현체에 영향을 주지 않는다.

이 예시에서는 Draft와 Publication이 상속 관계에 있지만, Bridge 패턴의 핵심은 상속이 아닌 추상화와 구현의 분리이다. Draft와 Publication은 구현체가 아닌 Display 인터페이스를 파라미터로 가지고 있기 때문에 Display의 구현체가 늘어나도 Draft 클래스에서는 변경할 필요가 없다는 것이 핵심이다.

**Bridge 패턴과 Strategy 패턴의 차이점**

| 구분   | Bridge Pattern                                                                  | Strategy Pattern                                                             |
|------|---------------------------------------------------------------------------------|------------------------------------------------------------------------------|
| 공통점  | 인터페이스를 통한 구현의 추상화                                                               | 인터페이스를 통한 구현의 추상화                                                            |
| 차이점  | - 구조 패턴<br>  - 추상화와 구현을 분리함<br>- 구조적인 문제 해결에 초점<br>- 추상화 계층과 구현 계층이 독립적으로 확장 가능 | - 행동 패턴<br>  - 알고리즘 캡슐화<br>- 행동의 변화 관리에 초점<br>- 실행 시점에 알고리즘을 교체할 수 있는 유연성 제공 |
| 목적   | 	- 구현 변경이 추상화에 영향을 주지 않도록 함<br>- 두 계층의 독립적인 발전과 확장 가능성을 제공                      | - 클라이언트에서 사용하는 알고리즘의 다양성을 제공<br>- 같은 문제를 다른 방법으로 해결할 수 있게 함                  |
| 사용시점 | - 시스템 설계 시<br>- 추상화와 구현이 동시에 확장될 필요가 있을 때 사용                                    | 실행 시점에<br>- 전략을 쉽게 변경하고 싶을 때 사용                                              |





