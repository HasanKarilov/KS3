package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Employee;
import com.springapp.mvc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

// For save session
@SessionAttributes("book")
@Controller
public class EmployeeController {

    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }


    @RequestMapping(value = "customer", method = RequestMethod.GET)
    public String getBooks(Model model) {
        List<Employee> books = this.employeeRepository.listAll();

        model.addAttribute("employee", books);

        return "customer/customer";
    }

    @RequestMapping(value = "customerAdd", method = RequestMethod.GET)
    public String addBook(Model model) {
        model.addAttribute("book", new Employee());
        return "customer/customerAdd";
    }

    @RequestMapping(value = "customerAdd", method = RequestMethod.POST)
    public String addBook(@Valid @ModelAttribute("book")Employee employee, BindingResult bindingResult, Model model) {
        String strError;
        if(bindingResult.hasErrors()){
            strError="Ошибка при добавлении нового сотрудника!!!";
            model.addAttribute("error", strError);
            return "customer/customerAdd";
        }

        this.employeeRepository.addEmployee(employee);
        model.addAttribute("book", employee);
        strError = "Успешно добавлено";
        model.addAttribute("success", strError);
        return "customer/customerAdd";
    }


//    @RequestMapping(value = "deleteBook/{id}", method = RequestMethod.GET)
//    public String deleteBook(@PathVariable String id) {
//        this.bookRepository.removeBook(id);
//
//        return "redirect:/customer";
//    }

    /**
     * Deletes a record including all the associated credit cards
     */

    @RequestMapping(value = "/deleteBook/{id}", method = RequestMethod.GET)
    public String getDelete(@PathVariable String id ) {


        // Delete person
        employeeRepository.removeEmployee(id);

        // Redirect to url
        return "redirect:/customer";
    }


    @RequestMapping(value = "editCustomer", method = RequestMethod.GET)
    public String getEdit(@PathVariable String id, Model model) {

        // Retrieve existing Person and add to model
        // This is the formBackingOBject
        model.addAttribute("personAttribute", employeeRepository.list(id));

        // This will resolve to /WEB-INF/jsp/editpage.jsp
        return "customer/editCustomer";
    }

    /**
     * Edits an existing person by delegating the processing to PersonService.
     * Displays a confirmation JSP page
     *
     * @return  the name of the JSP page
     */
    @RequestMapping(value = "editCustomer", method = RequestMethod.POST)
    public String saveEdit(@ModelAttribute("personAttribute") Employee book,
                           @PathVariable String id,
                           Model model) {

        // The "personAttribute" model has been passed to the controller from the JSP
        // We use the name "personAttribute" because the JSP uses that name

        // We manually assign the id because we disabled it in the JSP page
        // When a field is disabled it will not be included in the ModelAttribute
        book.setEmployeeID(id);

        // Delegate to PersonService for editing
        employeeRepository.editBook(book);

        // Add id reference to Model
        model.addAttribute("id", id);

        // This will resolve to /WEB-INF/jsp/editedpage.jsp
        return "redirect:/customer";
    }





    @RequestMapping(value = "form5", method = RequestMethod.GET)
    public String printWelcome(Model model) {
        model.addAttribute("message", "Hello world!");
        return "form5";
    }

    @RequestMapping(value = "form1", method = RequestMethod.GET)
    public String printFomr1(Model model) {
        model.addAttribute("message", "Hello world!");
        return "form1";
    }
}
