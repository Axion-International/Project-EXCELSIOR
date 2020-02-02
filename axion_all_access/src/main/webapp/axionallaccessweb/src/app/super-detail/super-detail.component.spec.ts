import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SuperDetailComponent } from './super-detail.component';

describe('SuperDetailComponent', () => {
  let component: SuperDetailComponent;
  let fixture: ComponentFixture<SuperDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SuperDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SuperDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
