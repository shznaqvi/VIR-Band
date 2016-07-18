package com.example.hassannaqvi.virband;

import java.util.Collection;

/**
 * Created by hassan.naqvi on 6/25/2016.
 */
public interface FormsDAO {
    Collection<FormsContract> getAllForms();

    Long addForm(FormsContract fc);

    void deleteForm(Long formID);

    void deleteAllForms();
}

