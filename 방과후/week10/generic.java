package 방과후.week10;

public class generic {
    public static void main(String[] args) {
//D<A> d1 = new D<>(); //(불가능)
        D<B> d2 = new D<>();
        D<C> d3 = new D<>();
        D d4 = new D(); //D<B> d4 = D<>();와 동일
        d2.set(new B());
        d2.set(new C());
// d3.set(new B()); //(불가능) -> 제네릭에서 C만 온다고 명시함
// 상속이니까 되지 않나요? 안됩니다.
        d3.set(new C());
        d4.set(new B());
        d4.set(new C());
    }
}
class A{}
class B extends A{}
class C extends B{}
class D <T extends B>{
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}