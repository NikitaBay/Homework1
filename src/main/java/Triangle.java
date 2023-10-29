public class Triangle {
    public static void main(String[] args) {

        int sideA = 20;
        int sideB = 10;
        int sideC = 20;
        double sideH = Math.sqrt(sideC * sideC - (sideB / 2) * (sideB / 2));    // Находим высоту треугольника
        double areaTriangle = 0.5 * sideB * sideH;  // Площадь равнобедренного треугольника

        System.out.println("Площадь равнобедренного треугольника = " + areaTriangle);

    }
}
