package ru.netology.domain.manager;

import ru.netology.domain.Tape;

public abstract class Manager {
    private Tape [] tapes;

    public Tape[] search(int idTape, String domain, String query, int count, int ownersOnly, int offset){
        return null;
    }
    public void delete (int ownerId, int postId) {
        return;
    }
}
