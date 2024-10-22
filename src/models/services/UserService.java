package models.services;


import models.model.Usuario;
import models.repository.UserRepository;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void crearUsuario(Usuario usuario) {
        // Lógica de validación podría ser añadida aquí
        userRepository.guardarUsuario(usuario);
    }

    public Usuario obtenerUsuario(int id) {
        return userRepository.obtenerUsuario(id);
    }
}

