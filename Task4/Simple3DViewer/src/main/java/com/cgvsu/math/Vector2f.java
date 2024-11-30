package com.cgvsu.math;

// Класс для представления и работы с 2D векторами
public class Vector2f {
    public float x, y;

    // Конструктор для инициализации вектора
    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Метод для сложения другого вектора с этим вектором
    public Vector2f add(Vector2f v) {
        return new Vector2f(this.x + v.x, this.y + v.y);
    }

    // Метод для вычитания другого вектора из этого вектора
    public Vector2f subtract(Vector2f v) {
        return new Vector2f(this.x - v.x, this.y - v.y);
    }

    // Метод для масштабирования вектора на скаляр
    public Vector2f scale(float scalar) {
        return new Vector2f(this.x * scalar, this.y * scalar);
    }

    // Метод для вычисления скалярного произведения с другим вектором
    public float dot(Vector2f v) {
        return this.x * v.x + this.y * v.y;
    }

    // Метод для вычисления длины (модуля) вектора
    public float length() {
        return (float) Math.sqrt(x * x + y * y);
    }

    // Метод для нормализации вектора (приведение к единичной длине)
    public Vector2f normalize() {
        float len = length();
        if (len == 0) {
            throw new ArithmeticException("Невозможно нормализовать вектор с нулевой длиной.");
        }
        return new Vector2f(this.x / len, this.y / len);
    }

    // Метод для получения строкового представления вектора
    @Override
    public String toString() {
        return "Vector2f(" + x + ", " + y + ")";
    }

    // Метод для проверки равенства двух векторов
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vector2f)) return false;
        Vector2f other = (Vector2f) obj;
        return Float.compare(this.x, other.x) == 0 && Float.compare(this.y, other.y) == 0;
    }

    // Метод для вычисления хеш-кода вектора
    @Override
    public int hashCode() {
        return Float.floatToIntBits(x) ^ Float.floatToIntBits(y);
    }
}
