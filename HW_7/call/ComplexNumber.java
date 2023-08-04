package call;

public class ComplexNumber {
    private double material;
    private double imaginary;

    /**
     *
     * @param material      Вещественная 
     * @param imaginary     Мнимая часть 
     */
    public ComplexNumber(double material, double imaginary) {
        this.material = material;
        this.imaginary = imaginary;
    }

    /**
     * 
     * @return Вещественная часть
     */
    public double getMaterial() {
        return material;
    }

    /**
     * @return Мнимая часть
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * сложение
     * 
     * @return Результат сложения
     */
    public ComplexNumber add(ComplexNumber other) {
        double sumMaterial = this.material + other.material;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumMaterial, sumImaginary);
    }

    /**
     * умножение
     *
     * @return Результат умножения
     */
    public ComplexNumber multiplication(ComplexNumber other) {
        double productMaterial = this.material * other.material - this.imaginary * other.imaginary;
        double productImaginary = this.material * other.imaginary + this.imaginary * other.material;
        return new ComplexNumber(productMaterial, productImaginary);
    }

    /**
     * деление
     *
     * @return Результат деления
     */
    public ComplexNumber divide(ComplexNumber other) {
        double divisor = other.material * other.material + other.imaginary * other.imaginary;
        double qMaterial = (this.material * other.material + this.imaginary * other.imaginary) / divisor;
        double qImaginary = (this.imaginary * other.material - this.material * other.imaginary) / divisor;
        return new ComplexNumber(qMaterial, qImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return material + " + " + imaginary + "i";
        } else {
            return material + " - " + Math.abs(imaginary) + "i";
        }
    }
}
