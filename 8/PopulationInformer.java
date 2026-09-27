class Populationinformer {

    public static String getPopulationPercent(Continent continent) {
        String result;
        switch (continent){
            case ASIA ->   result = "59.5%";
            case AFRICA ->  result = "16.9%";
            case EUROPE -> result = "9.7%";
            case AUSTRALIA ->  result = "0.5%";
            case ANTARCTICA -> result = "<0.1%";
            case NORTH_AMERICA -> result = "7.7%";
            case SOUTH_AMERICA -> result = "5.6%";
            default -> result = "Такого материка не существует.";
        }

        return result;
    }
}

enum Continent {
    ASIA,
    AFRICA,
    NORTH_AMERICA,
    SOUTH_AMERICA,
    ANTARCTICA,
    EUROPE,
    AUSTRALIA
}


 class Practicum4 {
    public static void main(String[] args) {
        Populationinformer populatioInformer = new Populationinformer();
        System.out.println(populatioInformer.getPopulationPercent(Continent.ASIA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.AFRICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.NORTH_AMERICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.SOUTH_AMERICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.ANTARCTICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.AUSTRALIA));
    }
}
