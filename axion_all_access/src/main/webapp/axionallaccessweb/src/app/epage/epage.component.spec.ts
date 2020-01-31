import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EpageComponent } from './epage.component';

describe('EpageComponent', () => {
  let component: EpageComponent;
  let fixture: ComponentFixture<EpageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EpageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EpageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
