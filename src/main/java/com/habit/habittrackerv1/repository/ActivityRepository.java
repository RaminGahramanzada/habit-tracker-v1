package com.habit.habittrackerv1.repository;

import com.habit.habittrackerv1.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity,Integer> {
}
