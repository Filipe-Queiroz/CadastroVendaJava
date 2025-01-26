/**
 * 
 */
package br.com.fqueiroz.services;

import br.com.fqueiroz.domain.Cliente;
import br.com.fqueiroz.exceptions.DAOException;
import br.com.fqueiroz.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
