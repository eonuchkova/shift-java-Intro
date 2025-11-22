public class Udav {
    public static void main(String[] args) {
        float boaCm=380; //boaCm - длина удава в сантиметрах
        float boaHeight= boaCm/100; //boaHeight - длина удава в метрах

        // Количество животных в одном удаве, где Count-количество
        float parrotCount=38;
        float monkeyCount=5;
        float elephantCount=2;

        // Height - рост
        float parrotHeight= boaHeight/parrotCount;
        float monkeyHeight= boaHeight/monkeyCount;
        float elephantHeight= boaHeight/elephantCount;

        float SumAnimalsHeight = boaHeight + parrotHeight + monkeyHeight + elephantHeight;

        System.out.println("Вычисляем рост персонажей мультика '38 попугаев'");
        System.out.println("Рост удава = " + boaHeight);
        System.out.println("Рост попугая = " + parrotHeight);
        System.out.println("Рост мартышки = " + monkeyHeight);
        System.out.println("Рост слонёнка = " + elephantHeight);
        System.out.println("Суммарный рост всех = " + SumAnimalsHeight);
    }
}