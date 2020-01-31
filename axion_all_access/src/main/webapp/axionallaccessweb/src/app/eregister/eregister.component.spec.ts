import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EregisterComponent } from './eregister.component';

describe('EregisterComponent', () => {
  let component: EregisterComponent;
  let fixture: ComponentFixture<EregisterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EregisterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
