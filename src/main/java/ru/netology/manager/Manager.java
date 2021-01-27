package ru.netology.domain.manager;

import ru.netology.domain.Post;

public abstract class Manager {
    private Post [] posts;

    public Post[] search(int idTape, String domain, String query, int count, int ownersOnly, int offset){
        return null;
    }
    public void delete (int ownerId, int postId) {
        return;
    }
}
