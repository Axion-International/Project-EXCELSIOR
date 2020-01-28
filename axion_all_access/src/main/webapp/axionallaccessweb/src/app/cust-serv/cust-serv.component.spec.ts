import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustServComponent } from './cust-serv.component';

describe('CustServComponent', () => {
  let component: CustServComponent;
  let fixture: ComponentFixture<CustServComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustServComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustServComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
