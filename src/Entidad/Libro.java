/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author cdb
 */
public class Libro {
    public long isbn;
    public String titulo;
    public String autor;
    public int numeroDePaginas;

    public Libro(long isbn, String titulo, String autor, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public Libro() {
    }
    
    public void crear(long isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
    public String mostrar() {
        return "ISBN: " + isbn + "\n" + "Titulo: " + titulo +"\n"+ "Autor: " + autor+ "\n" + "Numero de paginas: "+ numeroDePaginas;
    }
}
//1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.