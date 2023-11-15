package co.edu.udea.SalasInfo.Controller;

import co.edu.udea.SalasInfo.Model.Application;
import co.edu.udea.SalasInfo.Model.Room;
import co.edu.udea.SalasInfo.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("/find-all")
    public ResponseEntity<List<Room>> findAll() {
        return roomService.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<Room> save(@RequestBody Room room) {
        return roomService.createRoom(room);
    }

    @GetMapping("/find-by-id/{id}")
    public ResponseEntity<Room> findById(@PathVariable Integer id) {
        return roomService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Room> remove(@PathVariable Integer id) {
        return roomService.deleteRoom(id);
    }

    @PutMapping("/update")
    public ResponseEntity<Room> update(@RequestBody Room room) {
        return roomService.updateRoom(room);
    }
}
