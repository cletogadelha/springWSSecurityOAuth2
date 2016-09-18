package com.cletogadelha.sevice;

import java.util.List;

import com.cletogadelha.entity.Collaborator;

public interface CollaboratorService {
  Collaborator getDetails(Integer id);
  List<Collaborator> getCollaboratorsList();
  Collaborator saveCollaborator(Collaborator colab);
  void removeCollaborator(Integer id);
}
