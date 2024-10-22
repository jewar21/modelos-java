package models.repository;

import models.model.Usuario;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<Integer, Usuario> baseDeDatos = new HashMap<>();
    private int currentId = 1;

    public void guardarUsuario(Usuario usuario) {
        usuario.setId(currentId++);
        baseDeDatos.put(usuario.getId(), usuario);
    }

    public Usuario obtenerUsuario(int id) {
        return baseDeDatos.get(id);
    }
}

