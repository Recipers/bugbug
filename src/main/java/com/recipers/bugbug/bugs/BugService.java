package com.recipers.bugbug.bugs;

import com.recipers.bugbug.bugs.domain.Bug;
import com.recipers.bugbug.bugs.repository.BugRepository;
import com.recipers.bugbug.common.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BugService {

    private final BugRepository bugRepository;

    public Bug findBugById(Long id) {

        return bugRepository.findById(id).orElseThrow(()-> new NotFoundException(""));
    }

}
