public class Udav {
    public static void main(String[] args) {
        float udavCm=380f; //uCm - длина удава в сантиметрах
        float udavM= udavCm/100f; //uM - длина удава в метрах

        // Количество животных в одном удаве, где Count-количество, popug-попугай, martysh-мартышка, elephant-слоненок,
        float popugCount=38f;
        float martyshCount=5f;
        float elephantCount=2f;

        // Height - рост
        float popugHeight= udavM/popugCount;
        float martyshHeight= udavM/martyshCount;
        float elephantHeight= udavM/elephantCount;

        float SumAnimalsH = udavM + popugHeight + martyshHeight + elephantHeight;

        System.out.println("Вычисляем рост персонажей мультика '38 попугаев'");
        System.out.println("Рост удава = " + udavM);
        System.out.println("Рост попугая = " + popugHeight);
        System.out.println("Рост мартышки = " + martyshHeight);
        System.out.println("Рост слонёнка = " + elephantHeight);
        System.out.println("Суммарный рост всех = " + SumAnimalsH);
    }
}