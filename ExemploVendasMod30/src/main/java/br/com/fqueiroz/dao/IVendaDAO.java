/**
 * 
 */
package br.com.fqueiroz.dao;

import br.com.fqueiroz.dao.generic.IGenericDAO;
import br.com.fqueiroz.domain.Venda;
import br.com.fqueiroz.exceptions.DAOException;
import br.com.fqueiroz.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
