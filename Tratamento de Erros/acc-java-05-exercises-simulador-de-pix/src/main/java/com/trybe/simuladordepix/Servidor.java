package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Classe Servidor.
 */
public interface Servidor {

  Conexao abrirConexao() throws IOException;
}
