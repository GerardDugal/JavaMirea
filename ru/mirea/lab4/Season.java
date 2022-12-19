package ru.mirea.lab4;

public enum Season {
    WINTER(-3), SPRING(15), AUTUMN(8), SUMMER(27){
        @Override
        public String getDiscription(){
            return "Теплое время года";
        }
    };

    private double Tmp;

    Season(double Tmp){
        this.Tmp = Tmp;
    }

    public double getTmp(){
        return Tmp;
    }

    public String getDiscription(){
        return "Холодное время года";
    }
}
