public class BoletimTrimestral {
    private double notaTrimestre1;
    private double notaTrimestre2;
    private double notaTrimestre3;
    private double notaTrimestre4;

    public double getNotatrimestre1() {
        return notaTrimestre1;
    }

    public void setNotatrimestre1(double notatrimestre1) {
        this.notaTrimestre1 = notatrimestre1;
    }

    public double getNotatrimestre2() {
        return notaTrimestre2;
    }

    public void setNotatrimestre2(double notatrimestre2) {
        this.notaTrimestre2 = notatrimestre2;
    }

    public double getNotaTrimestre3() {
        return notaTrimestre3;
    }

    public void setNotaTrimestre3(double notaTrimestre3) {
        this.notaTrimestre3 = notaTrimestre3;
    }

    public double getNotatrimestre4() {
        return notaTrimestre4;
    }

    public void setNotatrimestre4(double notatrimestre4) {
        this.notaTrimestre4 = notatrimestre4;
    }
    public double mediaAnual() {
        double mediaAnual = (this.notaTrimestre1 + this.notaTrimestre2 + this.notaTrimestre3 + this.notaTrimestre4) / 4;
        return mediaAnual;
    }

 public static void main(String args[]){
        BoletimTrimestral boletimTrimestral = new BoletimTrimestral();

        boletimTrimestral.setNotatrimestre1(8.5);
        System.out.println("nota do 1 trimestre foi " + boletimTrimestral.notaTrimestre1);
        boletimTrimestral.setNotatrimestre2(7.5);
        System.out.println("nota do 2 trimestre foi " + boletimTrimestral.notaTrimestre2);
        boletimTrimestral.setNotaTrimestre3(9.0);
        System.out.println("nota do 3 trimestre foi " + boletimTrimestral.notaTrimestre3);
        boletimTrimestral.setNotatrimestre4(9.5);
        System.out.println("nota do 4 trimestre foi " + boletimTrimestral.notaTrimestre4);

        System.out.println("A média anual é " +boletimTrimestral.mediaAnual());
 }
}
