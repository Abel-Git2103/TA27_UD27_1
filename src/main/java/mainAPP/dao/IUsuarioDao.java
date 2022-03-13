package mainAPP.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainAPP.dto.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}
