package org.yan.practice.patterns.stuctural.adapter;

/**
 * @author pangyan
 * @date 2020/5/12 14:59
 * @description 客户端
 *
 * 适配器模式用于资源转换，A方法需要A资源，创建一个和A资源相同类型的适配器类
 * 实现A资源的出口，把B资源作为适配器的属性，经过逻辑修饰，把B资源转换并且输出
 * 这样就实现了A方法调用B资源
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);

        RoundPeg roundPeg1 = new RoundPeg(5);
        System.out.println(roundHole.fits(roundPeg1));

        RoundPeg roundPeg2 = new RoundPeg(5);
        System. out.println(roundHole.fits(roundPeg2));

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(new SquarePeg(4));
        System.out.println(roundHole.fits(smallSquarePegAdapter));

        SquarePegAdapter lagerSquarePegAdapter = new SquarePegAdapter(new SquarePeg(8));
        System.out.println(roundHole.fits(lagerSquarePegAdapter));

    }
}
