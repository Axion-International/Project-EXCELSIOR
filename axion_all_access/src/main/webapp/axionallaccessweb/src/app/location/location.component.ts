import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Location } from '../location.class';

@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css']
})
export class LocationComponent implements OnInit {
  private locations: Location[];
  private area: Location;
  areaForm: FormGroup;
  submitted = false;
  
  constructor(private formBuilder: FormBuilder, private service:EmployeeService
  ) { 
    this.area = new Location();
  }

  ngOnInit() {
    this.service.locationList().subscribe(data=>{
      this.locations = data;
    });
    this.areaForm = this.formBuilder.group ({
      city: ['', Validators.required]
    })
   
  }

  get f() { return this.areaForm.controls; }

  onSubmit() {
    
    this.submitted = true;
    if(this.areaForm.invalid){
      return;
    }
    else {
      console.log(this.f.city.value)
      this.area.city = this.f.city.value;
      this.service.addLocation(this.area).subscribe(res=>{
        this.ngOnInit();
      })
    }
  }
}
