package com.cletogadelha.sevice;

import java.util.List;

import com.cletogadelha.entity.Collaborator;

public interface CollaboratorService {
  public Collaborator getDetalhesCollaborator(Integer id);
  public List<Collaborator> getListaCollaborators();
  public Collaborator salvarCollaborator(Collaborator colab);
  public void removeCollaborator(Integer id);
}
