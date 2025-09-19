package com.libreria.libreria;

import com.libreria.libreria.adapter.IBook;
import com.libreria.libreria.adapter.LegacyBook;
import com.libreria.libreria.adapter.LegacyBookAdapter;
import com.libreria.libreria.builder.BookBuilder;
import com.libreria.libreria.model.Book;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

    public static void main(String[] args) {
	// Instancia del servicio principal
	LibreriaService service = new LibreriaService();

	// Observer para notificaciones de préstamo
	com.libreria.libreria.observer.PrestamoObserver observer = new com.libreria.libreria.observer.PrestamoObserver();
	service.addObserver(observer);

	// Builder para crear libros
	Book libro1 = new BookBuilder()
		.setId(1L)
		.setTitulo("Cien años de soledad")
		.setAutor("Gabriel García Márquez")
		.setTipo(com.libreria.libreria.model.TipoLibro.FICCION)
		.setFormato(com.libreria.libreria.model.FormatoLibro.FISICO)
		.build();

	Book libro2 = new BookBuilder()
		.setId(2L)
		.setTitulo("Sapiens")
		.setAutor("Yuval Noah Harari")
		.setTipo(com.libreria.libreria.model.TipoLibro.NO_FICCION)
		.setFormato(com.libreria.libreria.model.FormatoLibro.DIGITAL)
		.build();

	// Agregar libros con validación
	service.agregarLibro(libro1);
	service.agregarLibro(libro2);

	// Strategy: buscar por título
	service.setSearchStrategy(new com.libreria.libreria.strategy.SearchByTitle());
	System.out.println("Buscar por título 'Cien': " + service.buscarLibros("Cien"));

	// Strategy: buscar por autor
	service.setSearchStrategy(new com.libreria.libreria.strategy.SearchByAuthor());
	System.out.println("Buscar por autor 'Harari': " + service.buscarLibros("Harari"));

	// Listar todos los libros
	System.out.println("Libros en la biblioteca: " + service.listarLibros());

	// Prestar un libro (Observer y Decorator)
	service.prestarLibro(1L);

	// Adapter: integrar libro legado
	LegacyBook legacy = new LegacyBook(99L, "Don Quijote", "Cervantes");
	IBook adaptado = new LegacyBookAdapter(legacy);
	System.out.println("Libro adaptado: " + adaptado.getTittle() + " de " + adaptado.getAuthor());
    }

}
