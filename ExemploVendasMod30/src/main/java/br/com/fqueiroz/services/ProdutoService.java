/**
 * 
 */
package br.com.fqueiroz.services;

import br.com.fqueiroz.dao.IProdutoDAO;
import br.com.fqueiroz.domain.Produto;
import br.com.fqueiroz.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
