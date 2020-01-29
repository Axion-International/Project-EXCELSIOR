import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginmodComponent } from './loginmod.component';

describe('LoginmodComponent', () => {
  let component: LoginmodComponent;
  let fixture: ComponentFixture<LoginmodComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginmodComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginmodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
