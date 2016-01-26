package com.cletogadelha.sevice;

import java.util.List;

import com.cletogadelha.entity.Colaborador;

public interface ColaboradorService {
  public Colaborador getDetalhesColaborador(Integer id);
  public List<Colaborador> getListaColaboradores();
  public Colaborador salvarColaborador(Colaborador colab);
  public void removeColaborador(Integer id);
}
