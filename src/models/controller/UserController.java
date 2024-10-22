// Clase: UserController (Capa de Presentación)
package models.controller;

import models.model.Usuario;
import models.services.UserService;

public class UserController {
    private UserService userService = new UserService();

    public void crearUsuario(String nombre, String email) {
        Usuario nuevoUsuario = new Usuario(nombre, email);
        userService.crearUsuario(nuevoUsuario);
    }

    public void mostrarUsuario(int id) {
        Usuario usuario = userService.obtenerUsuario(id);
        if (usuario != null) {
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Email: " + usuario.getEmail());
        } else {
            System.out.println("Usuario no encontrado");
        }
    }
}

