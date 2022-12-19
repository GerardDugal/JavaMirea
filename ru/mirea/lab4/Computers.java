package ru.mirea.lab4;

public enum Computers {
    MSI(1), SAMSUNG(2), LENOVO(3), HP(4);

    private int number;
    Computers(int number){
        this.number = number;
    }

    public String getProcessor(){
         if(this.number == 1) {
             return "\n       Processor: Intel Core i7-12700KF LGA1700, 12 x 3600 МГц, OEM";
         }
         if(this.number == 2){
             return "\n       Processor: Qualcomm Snapdragon 765";
         }
        if(this.number == 3){
            return "\n       Processor: Lenovo Процессор 4XG0F28787 Lenovo 1600Mhz";
        }
        if(this.number == 4){
            return "\n       Processor: HP Intel Xeon processor X5650 2.66GHZ 12M 6 CORES 95W 594884-001";
        }
        return null;
    }

    public String getMemory(){
        if(this.number == 1)
            return "\n       Memory: AMD Radeon R7 Performance 16 ГБ (8 ГБ x 2 шт.) DDR4 2666 МГц DIMM CL16 R7S416G2606U2K";
        if(this.number == 2)
            return "\n       Memory: 16 ГБ DDR4 3200 МГц DIMM M378A2G43MX3-CWE";
        if(this.number == 3)
            return "\n       Memory: Lenovo 8 ГБ DDR4 2400 МГц (4X70M60574)";
        if(this.number == 4)
            return "\n       Memory: HP 8 ГБ DDR4 3200 МГц SODIMM CL22 2E2M5AA";
        return null;
    }

    public String getMonitor(){
        if(this.number == 1)
            return "\n       Monitor: MSI Optix G271, 1920x1080, 144 Гц, IPS, черный";
        if(this.number == 2)
            return "\n       Monitor: Samsung Odyssey G5 C27G54TQW, 2560x1440, 144 Гц, *VA, черный";
        if(this.number == 3)
            return "\n       Monitor: Lenovo G25-20";
        if(this.number == 4)
            return "\n       Monitor: HP X24c (9FM22AA), 1920x1080, 144 Гц, *VA, черный";
        return null;
    }
}
