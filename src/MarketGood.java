public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;

    // 인스턴스 변수
    // 외부에서 바로 접근할 수 없도록 private 접근제어자를 붙여 선언

    public MarketGood(String name, int retailPrice) {
        this(name, retailPrice, 0);
    }

    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        if (discountRate < 0 || discountRate > 100) {
            discountRate = 0;
        }
        this.discountRate = discountRate;
    }

    // 생성자
    /*
    (1) 모든 인스턴스 변수에 값을 넣을 수 있는 public MarketGood(String name, int retailPrice, int discountRate)
    (2) discountRate에 기본값인 0을 지정해주는 public MarketGood(String name, int retailPrice) )
    중요한 것은 (2)번 생성자에서 (1)번 생성자를 이용한 점이다. 코드의 중복을 줄이고, 보기에도 편함.
    */

    public String getName() {
        return name;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int getDiscountedPrice() {
        return (int) (retailPrice * (1 - discountRate / 100.0));
    }

    // Getter / Setter 메소드
    // this 키워드를 사용하여 getter와 setter 메소드 생성.

    /*
    public int getDiscountedPrice() 이 부분은 형변환에 유의해야하는데,
    int로 선언된 discountRate를 100으로 나누어 할인율을 구하는 과정이 필요한데, 이 계산은 double로 되어야 한다.
    예를 들어서 10 / 100을 하면 원하는 0.1이 아니라 0이 나오기 때문이다.
     */
}