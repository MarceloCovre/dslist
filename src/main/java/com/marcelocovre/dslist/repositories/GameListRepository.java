package com.marcelocovre.dslist.repositories;

import com.marcelocovre.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
