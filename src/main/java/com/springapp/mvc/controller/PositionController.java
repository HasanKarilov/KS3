package com.springapp.mvc.controller;


import com.springapp.mvc.domain.Positions;
import com.springapp.mvc.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@Controller
public class PositionController {

    private PositionRepository positionRepository;
    @Autowired
    public PositionController(PositionRepository positionRepository){
        this.positionRepository = positionRepository;
    }


    @RequestMapping(value = "position", method = RequestMethod.GET)
    public String getPosts(Model model) {
        List<Positions> positionses = this.positionRepository.listPosition();

        model.addAttribute("position", positionses);

        return "position";
    }


    @RequestMapping(value = "positionAdd", method = RequestMethod.GET)
    public String addBook(Model model) {
        model.addAttribute("posts", new Positions());
        return "positionAdd";
    }

    @RequestMapping(value = "positionAdd", method = RequestMethod.POST)
    public String addBook(@Valid @ModelAttribute("posts")Positions position,
                          BindingResult bindingResult, Model model) {
        String strError;
        if(bindingResult.hasErrors()){
            strError="Ошибка при добавлении нового сотрудника!!!";
            model.addAttribute("error", strError);
            return "positionAdd";
        }

        this.positionRepository.addPosition(position);
        model.addAttribute("book", position);
        strError = "Успешно добавлено";
        model.addAttribute("success", strError);
        return "positionAdd";
    }

    @RequestMapping(value = "/deletePosition/{id}", method = RequestMethod.GET)
    public String getDelete(@PathVariable String id ) {


        // Delete data
        positionRepository.removePosition(id);
        // Redirect to url
        return "redirect:/position";
    }
}
