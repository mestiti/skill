package com.courzelo.quiz_skills.skills.businesses.iservices;


import com.courzelo.quiz_skills.skills.entities.Type;
import com.courzelo.quiz_skills.skills.entities.dtos.MacroskillsDTO;
import com.courzelo.quiz_skills.skills.entities.dtos.MicroskillsDTO;
import com.courzelo.quiz_skills.skills.entities.dtos.SkillsDTO;

import java.util.List;

public interface IServiceSkills {

    public SkillsDTO getskillbyid(String id);
    public List<MacroskillsDTO> getmacroskills(int id, Type type);
    public List<MicroskillsDTO> getmicroskills(int iduser, String name, Type type);

}
