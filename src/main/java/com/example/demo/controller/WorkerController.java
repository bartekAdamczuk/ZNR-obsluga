package com.example.demo.controller;

import com.example.demo.entity.Worker;
import com.example.demo.service.WorkerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class WorkerController {

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    //powinna byc metoda post i przeslanie danych z formularza
    //dla przykladu tutaj utworzymy workera
    @GetMapping("/create-test-worker")
    public void createWorker(){
        for(int i = 0 ; i < 15 ;i++){
            Worker worker = new Worker(123123123, "Bartek"+i, "Adamczuk"+i);
            workerService.saveWorker(worker);
        }
    }

    @GetMapping("/workers")
    public String getWorkers(Model model){
        List<Worker> workers = workerService.getAll();
        model.addAttribute("workers", workers);
        return "workers";
    }

    @GetMapping("/workers/{workerId}")
    public String getWorker(Model model, @PathVariable Long workerId){
        Optional<Worker> optionalWorker = workerService.getById(workerId);
        if(optionalWorker.isPresent()){
            model.addAttribute("worker", optionalWorker.get());
        }{
            throw new RuntimeException("Nie znaleziono goscia o id:"+workerId);
        }
    }
}
