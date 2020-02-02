import { Component, OnInit, Input } from '@angular/core';
import { Superbeing } from '../superbeing.class';
import { RadialChartOptions, ChartDataSets, ChartType } from 'chart.js';
import { UserService } from '../user.service';
import { Label } from 'ng2-charts';

@Component({
  selector: 'app-super-detail',
  templateUrl: './super-detail.component.html',
  styleUrls: ['./super-detail.component.css']
})
export class SuperDetailComponent implements OnInit {
  @Input() id:number
  private superbeing:Superbeing;
  public loading = false;
  public chartOptions: RadialChartOptions = {
    responsive: true,
  };
  public chartLabels: Label[] = ['Strength', 'Constitution', 'Agility', 'Intelligence'];

  public chartData: ChartDataSets[];
  public chartType: ChartType = 'radar';
  constructor(private user:UserService) { }

  ngOnInit() {
    this.user.getSuperbeing(this.id).subscribe(data=>{
      this.superbeing=data;
      this.chartData=[
        {data: [this.superbeing.strength,this.superbeing.constitution,this.superbeing.agility,this.superbeing.intelligence],label:'Stats'}
      ]
      this.loading = true;
    });
  }

}
