// package br.ifsp.model.dao;

// import br.ifsp.model.Usuario;
// import java.util.ArrayList;
// import java.util.List;

// public class UsuarioDAO {
//     private List<Usuario> usuarios;

//     public UsuarioDAO() {
//         usuarios = new ArrayList<>();
//         // Adicionando um usuário padrão para fins de teste
//         usuarios.add(new Usuario("admin", "1234"));
//     }

//     public void adicionarUsuario(Usuario usuario) {
//         usuarios.add(usuario);
//     }

//     public boolean autenticarUsuario(String nomeUsuario, String senha) {
//         for (Usuario usuario : usuarios) {
//             if (usuario.getNomeUsuario().equals(nomeUsuario) && usuario.getSenha().equals(senha)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
