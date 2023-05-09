package com.marcelocovre.dslist.repositories;

import com.marcelocovre.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
