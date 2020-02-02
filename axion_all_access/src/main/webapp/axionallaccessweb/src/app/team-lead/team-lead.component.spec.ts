import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TeamLeadComponent } from './team-lead.component';

describe('TeamLeadComponent', () => {
  let component: TeamLeadComponent;
  let fixture: ComponentFixture<TeamLeadComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TeamLeadComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TeamLeadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
