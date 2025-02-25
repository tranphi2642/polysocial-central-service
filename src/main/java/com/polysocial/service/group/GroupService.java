package com.polysocial.service.group;

import java.io.IOException;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.polysocial.dto.GroupDTO;
import com.polysocial.dto.ListMembersDTO;
import com.polysocial.dto.MemberDTO;
import com.polysocial.dto.PageObject;
import com.polysocial.entity.Groups;
import com.polysocial.entity.Members;
import com.polysocial.entity.Users;

public interface GroupService {

    PageObject<GroupDTO> getAll(Integer page, Integer limit);
    
    GroupDTO getOne(Long id);
    
    Groups updateGroup(Groups group);
        
    String deleteMemberToGroup(Long groupId, Long userId);
    
    GroupDTO deleteGroup(Long groupId);
    
    Object getTeacherFromGroup(Long groupId);
    
    Integer getUserId(String email);
    
    Groups createGroup(Groups group);
    
    Users getOneMemberInGroup(String email, Long groupId);
    
    List<Object> getMemberInGroup(Long id);
        
    Users getUserById(Long userId);
        
    Object createExcel(MultipartFile multipartFile) throws IOException;
    
    List<GroupDTO> findByKeywork(String keywork);
    
    MemberDTO saveMember(Long userId, Long groupId);
    
    List<MemberDTO> getAllGroupByStudent(Long userId);
    
    List<Object> getAllGroupByTeacher(Long userId);

    
    

}
